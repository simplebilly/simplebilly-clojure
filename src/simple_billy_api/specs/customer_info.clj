(ns simple-billy-api.specs.customer-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def customer-info-data
  {
   (ds/req :annual_volume) int?
   (ds/req :is_registered) boolean?
   })

(def customer-info-spec
  (ds/spec
    {:name ::customer-info
     :spec customer-info-data}))
