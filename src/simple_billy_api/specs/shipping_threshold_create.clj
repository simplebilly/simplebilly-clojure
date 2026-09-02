(ns simple-billy-api.specs.shipping-threshold-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipping-threshold-create-data
  {
   (ds/opt :isActive) boolean?
   (ds/opt :maxSellable) int?
   (ds/req :name) string?
   (ds/opt :notes) string?
   (ds/opt :productId) uuid?
   (ds/opt :reserveStock) int?
   (ds/opt :warehouseId) string?
   })

(def shipping-threshold-create-spec
  (ds/spec
    {:name ::shipping-threshold-create
     :spec shipping-threshold-create-data}))
