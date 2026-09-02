(ns simple-billy-api.specs.oss-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.oss-dependency :refer :all]
            )
  (:import (java.io File)))


(def oss-report-data
  {
   (ds/req :dependencies) (s/coll-of oss-dependency-spec)
   (ds/req :total_count) int?
   })

(def oss-report-spec
  (ds/spec
    {:name ::oss-report
     :spec oss-report-data}))
