(ns simple-billy-api.specs.supplier-invoice-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.supplier-invoice-status :refer :all]
            )
  (:import (java.io File)))


(def supplier-invoice-update-data
  {
   (ds/opt :currency) string?
   (ds/opt :goodsReceiptId) string?
   (ds/opt :invoiceDate) inst?
   (ds/opt :invoiceNumber) string?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :purchaseOrderId) string?
   (ds/opt :status) supplier-invoice-status-spec
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/opt :totalGrossAmount) string?
   (ds/opt :totalNetAmount) string?
   })

(def supplier-invoice-update-spec
  (ds/spec
    {:name ::supplier-invoice-update
     :spec supplier-invoice-update-data}))
