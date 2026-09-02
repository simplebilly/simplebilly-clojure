(ns simple-billy-api.specs.supplier-invoice-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.supplier-invoice-status :refer :all]
            )
  (:import (java.io File)))


(def supplier-invoice-create-data
  {
   (ds/opt :currency) string?
   (ds/opt :goodsReceiptId) string?
   (ds/req :invoiceDate) inst?
   (ds/req :invoiceNumber) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :purchaseOrderId) string?
   (ds/req :status) supplier-invoice-status-spec
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/opt :totalGrossAmount) string?
   (ds/opt :totalNetAmount) string?
   })

(def supplier-invoice-create-spec
  (ds/spec
    {:name ::supplier-invoice-create
     :spec supplier-invoice-create-data}))
