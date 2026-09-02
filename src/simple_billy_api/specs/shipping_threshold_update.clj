(ns simple-billy-api.specs.shipping-threshold-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipping-threshold-update-data
  {
   (ds/opt :isActive) boolean?
   (ds/opt :maxSellable) int?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   (ds/opt :productId) uuid?
   (ds/opt :reserveStock) int?
   (ds/opt :warehouseId) string?
   })

(def shipping-threshold-update-spec
  (ds/spec
    {:name ::shipping-threshold-update
     :spec shipping-threshold-update-data}))
