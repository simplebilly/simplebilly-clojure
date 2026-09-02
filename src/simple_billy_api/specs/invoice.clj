(ns simple-billy-api.specs.invoice
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.currency-code :refer :all]
            [simple-billy-api.specs.document-type :refer :all]
            [simple-billy-api.specs.invoice-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.payment-status :refer :all]
            [simple-billy-api.specs.preceding-sales-voucher-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.invoice-status :refer :all]
            [simple-billy-api.specs.country-code :refer :all]
            )
  (:import (java.io File)))


(def invoice-data
  {
   (ds/opt :attachments) any-type-spec
   (ds/opt :billingPeriodEnd) inst?
   (ds/opt :billingPeriodStart) inst?
   (ds/opt :cancellationDate) inst?
   (ds/opt :cancellationInvoiceId) string?
   (ds/opt :cancellationReason) string?
   (ds/opt :contractId) uuid?
   (ds/req :currency) currency-code-spec
   (ds/opt :customerId) string?
   (ds/opt :discountAmount) string?
   (ds/opt :discountDays) int?
   (ds/opt :discountPercentage) string?
   (ds/opt :documentType) document-type-spec
   (ds/opt :dunningLevel) int?
   (ds/opt :inputVatAmount) string?
   (ds/opt :inputVatDeductible) boolean?
   (ds/opt :inputVatPercentage) string?
   (ds/opt :introductionText) string?
   (ds/req :invoiceType) invoice-type-spec
   (ds/opt :isCancelled) boolean?
   (ds/opt :isDraft) boolean?
   (ds/opt :isEuAcquisition) boolean?
   (ds/opt :isEuDelivery) boolean?
   (ds/opt :isIntraCommunityAcquisition) boolean?
   (ds/opt :isReverseCharge) boolean?
   (ds/req :issueDate) inst?
   (ds/opt :ledgerAccount) string?
   (ds/req :lineItems) any-type-spec
   (ds/opt :margin25a) boolean?
   (ds/opt :margin25aGross) string?
   (ds/opt :margin25aPurchasePrice) string?
   (ds/opt :notes) string?
   (ds/opt :orderNumber) string?
   (ds/opt :originalPdfPath) string?
   (ds/opt :paidAmount) string?
   (ds/opt :paymentDueDate) inst?
   (ds/opt :paymentStatus) payment-status-spec
   (ds/opt :paymentTermsText) string?
   (ds/opt :precedingSalesVoucherId) string?
   (ds/opt :precedingSalesVoucherType) preceding-sales-voucher-type-spec
   (ds/opt :receiptConfirmationAvailable) boolean?
   (ds/opt :relatedInvoiceId) uuid?
   (ds/opt :relationshipType) string?
   (ds/opt :senderSnapshot) any-type-spec
   (ds/opt :sentAt) inst?
   (ds/opt :servicePeriodEnd) inst?
   (ds/opt :servicePeriodStart) inst?
   (ds/req :status) invoice-status-spec
   (ds/req :subtotal) string?
   (ds/opt :supplierId) string?
   (ds/opt :taxExemptionReason) string?
   (ds/req :totalAmount) string?
   (ds/req :totalTax) string?
   (ds/opt :vatCountry) country-code-spec
   (ds/opt :vatSpecialCase) string?
   })

(def invoice-spec
  (ds/spec
    {:name ::invoice
     :spec invoice-data}))
