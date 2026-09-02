(ns simple-billy-api.specs.supplier-condition-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def supplier-condition-update-data
  {
   (ds/opt :currency) string?
   (ds/opt :deliveryTerms) string?
   (ds/opt :earlyPaymentDiscountPercent) string?
   (ds/opt :isDefault) boolean?
   (ds/opt :minimumOrderValue) string?
   (ds/opt :notes) string?
   (ds/opt :paymentDueDays) int?
   (ds/opt :paymentTerms) string?
   (ds/opt :supplierContactId) string?
   (ds/opt :supplierName) string?
   (ds/opt :volumeDiscountTiers) any-type-spec
   })

(def supplier-condition-update-spec
  (ds/spec
    {:name ::supplier-condition-update
     :spec supplier-condition-update-data}))
