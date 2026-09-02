(ns simple-billy-api.specs.goods-receipt
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def goods-receipt-data
  {
   (ds/req :grNumber) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :purchaseOrderId) string?
   (ds/req :receiptDate) inst?
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/req :warehouseId) string?
   })

(def goods-receipt-spec
  (ds/spec
    {:name ::goods-receipt
     :spec goods-receipt-data}))
