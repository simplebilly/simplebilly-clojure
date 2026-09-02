(ns simple-billy-api.specs.shipping-rule
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.country-code :refer :all]
            )
  (:import (java.io File)))


(def shipping-rule-data
  {
   (ds/opt :carrier) string?
   (ds/opt :country) country-code-spec
   (ds/opt :deliveryTime) string?
   (ds/opt :isActive) boolean?
   (ds/opt :maxWeightKg) float?
   (ds/opt :minWeightKg) float?
   (ds/req :name) string?
   (ds/opt :notes) string?
   (ds/req :price) string?
   (ds/opt :priority) int?
   })

(def shipping-rule-spec
  (ds/spec
    {:name ::shipping-rule
     :spec shipping-rule-data}))
