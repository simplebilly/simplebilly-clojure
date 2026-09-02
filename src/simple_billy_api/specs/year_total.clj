(ns simple-billy-api.specs.year-total
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def year-total-data
  {
   (ds/req :tco2e) string?
   (ds/req :year) int?
   })

(def year-total-spec
  (ds/spec
    {:name ::year-total
     :spec year-total-data}))
