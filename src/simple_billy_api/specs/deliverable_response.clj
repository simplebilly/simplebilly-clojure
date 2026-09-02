(ns simple-billy-api.specs.deliverable-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def deliverable-response-data
  {
   (ds/req :availableStock) int?
   (ds/req :deliverableQuantity) int?
   (ds/opt :maxSellable) int?
   (ds/req :productId) uuid?
   (ds/req :reservedStock) int?
   (ds/opt :warehouseId) string?
   })

(def deliverable-response-spec
  (ds/spec
    {:name ::deliverable-response
     :spec deliverable-response-data}))
