(ns simple-billy-api.specs.oss-dependency
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def oss-dependency-data
  {
   (ds/req :dependency_type) string?
   (ds/opt :license) string?
   (ds/req :name) string?
   (ds/req :version) string?
   })

(def oss-dependency-spec
  (ds/spec
    {:name ::oss-dependency
     :spec oss-dependency-data}))
