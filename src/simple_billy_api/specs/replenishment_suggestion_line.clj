(ns simple-billy-api.specs.replenishment-suggestion-line
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def replenishment-suggestion-line-data
  {
   (ds/req :currentStock) int?
   (ds/opt :maxStock) int?
   (ds/opt :minStock) int?
   (ds/req :productId) uuid?
   (ds/req :productName) string?
   (ds/req :sku) string?
   (ds/req :sourceAvailable) int?
   (ds/req :sourceWarehouseId) string?
   (ds/req :suggestedQuantity) int?
   (ds/req :targetWarehouseId) string?
   })

(def replenishment-suggestion-line-spec
  (ds/spec
    {:name ::replenishment-suggestion-line
     :spec replenishment-suggestion-line-data}))
