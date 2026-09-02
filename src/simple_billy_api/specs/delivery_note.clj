(ns simple-billy-api.specs.delivery-note
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.preceding-sales-voucher-type :refer :all]
            [simple-billy-api.specs.voucher-status :refer :all]
            )
  (:import (java.io File)))


(def delivery-note-data
  {
   (ds/opt :address) any-type-spec
   (ds/opt :contactId) string?
   (ds/opt :contactName) string?
   (ds/req :currency) string?
   (ds/opt :deliveryDate) inst?
   (ds/opt :deliveryNoteNumber) string?
   (ds/opt :files) any-type-spec
   (ds/opt :introduction) string?
   (ds/opt :lineItems) any-type-spec
   (ds/opt :precedingSalesVoucherId) string?
   (ds/opt :precedingSalesVoucherType) preceding-sales-voucher-type-spec
   (ds/opt :remark) string?
   (ds/opt :shippingDate) inst?
   (ds/opt :shippingMethod) string?
   (ds/opt :subtotal) string?
   (ds/opt :title) string?
   (ds/opt :totalAmount) string?
   (ds/req :voucherDate) inst?
   (ds/req :voucherStatus) voucher-status-spec
   })

(def delivery-note-spec
  (ds/spec
    {:name ::delivery-note
     :spec delivery-note-data}))
