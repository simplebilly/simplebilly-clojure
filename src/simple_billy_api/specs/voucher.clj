(ns simple-billy-api.specs.voucher
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.payment-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.voucher-status :refer :all]
            [simple-billy-api.specs.voucher-type :refer :all]
            )
  (:import (java.io File)))


(def voucher-data
  {
   (ds/opt :categoryId) string?
   (ds/opt :contactId) string?
   (ds/opt :contactName) string?
   (ds/req :currency) string?
   (ds/opt :description) string?
   (ds/opt :fileAttachments) any-type-spec
   (ds/opt :lineItems) any-type-spec
   (ds/opt :metadata) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :openAmount) string?
   (ds/opt :paidDate) inst?
   (ds/opt :paymentStatus) payment-status-spec
   (ds/opt :taxAmounts) any-type-spec
   (ds/opt :taxCondition) string?
   (ds/opt :totalGrossAmount) string?
   (ds/opt :totalNetAmount) string?
   (ds/req :voucherDate) inst?
   (ds/opt :voucherNumber) string?
   (ds/req :voucherStatus) voucher-status-spec
   (ds/req :voucherType) voucher-type-spec
   })

(def voucher-spec
  (ds/spec
    {:name ::voucher
     :spec voucher-data}))
