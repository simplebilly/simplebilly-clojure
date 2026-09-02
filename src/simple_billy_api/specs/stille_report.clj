(ns simple-billy-api.specs.stille-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.stille-partner-zeile :refer :all]
            )
  (:import (java.io File)))


(def stille-report-data
  {
   (ds/req :jahresueberschuss) string?
   (ds/req :partners) (s/coll-of stille-partner-zeile-spec)
   (ds/req :year) int?
   })

(def stille-report-spec
  (ds/spec
    {:name ::stille-report
     :spec stille-report-data}))
