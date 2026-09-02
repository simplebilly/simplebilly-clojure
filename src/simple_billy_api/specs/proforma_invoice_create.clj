(ns simple-billy-api.specs.proforma-invoice-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.currency-code :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.proforma-invoice-status :refer :all]
            )
  (:import (java.io File)))


(def proforma-invoice-create-data
  {
   (ds/opt :convertedAt) inst?
   (ds/opt :convertedToInvoiceId) string?
   (ds/req :currency) currency-code-spec
   (ds/opt :customerId) string?
   (ds/opt :customerSnapshot) any-type-spec
   (ds/req :issueDate) inst?
   (ds/req :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :orderNumber) string?
   (ds/opt :paymentDueDate) inst?
   (ds/opt :quotationId) string?
   (ds/req :status) proforma-invoice-status-spec
   (ds/req :subtotal) string?
   (ds/req :totalAmount) string?
   (ds/req :totalTax) string?
   })

(def proforma-invoice-create-spec
  (ds/spec
    {:name ::proforma-invoice-create
     :spec proforma-invoice-create-data}))
