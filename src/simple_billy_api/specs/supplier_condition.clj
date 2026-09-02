(ns simple-billy-api.specs.supplier-condition
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def supplier-condition-data
  {
   (ds/req :currency) string?
   (ds/opt :deliveryTerms) string?
   (ds/opt :earlyPaymentDiscountPercent) string?
   (ds/opt :isDefault) boolean?
   (ds/opt :minimumOrderValue) string?
   (ds/opt :notes) string?
   (ds/opt :paymentDueDays) int?
   (ds/opt :paymentTerms) string?
   (ds/req :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/opt :volumeDiscountTiers) any-type-spec
   })

(def supplier-condition-spec
  (ds/spec
    {:name ::supplier-condition
     :spec supplier-condition-data}))
