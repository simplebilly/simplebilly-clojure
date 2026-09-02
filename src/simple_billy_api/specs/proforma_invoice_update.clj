(ns simple-billy-api.specs.proforma-invoice-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.currency-code :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.proforma-invoice-status :refer :all]
            )
  (:import (java.io File)))


(def proforma-invoice-update-data
  {
   (ds/opt :convertedAt) inst?
   (ds/opt :convertedToInvoiceId) string?
   (ds/opt :currency) currency-code-spec
   (ds/opt :customerId) string?
   (ds/opt :customerSnapshot) any-type-spec
   (ds/opt :issueDate) inst?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :orderNumber) string?
   (ds/opt :paymentDueDate) inst?
   (ds/opt :quotationId) string?
   (ds/opt :status) proforma-invoice-status-spec
   (ds/opt :subtotal) string?
   (ds/opt :totalAmount) string?
   (ds/opt :totalTax) string?
   })

(def proforma-invoice-update-spec
  (ds/spec
    {:name ::proforma-invoice-update
     :spec proforma-invoice-update-data}))
