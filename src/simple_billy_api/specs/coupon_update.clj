(ns simple-billy-api.specs.coupon-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.discount-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coupon-update-data
  {
   (ds/opt :code) string?
   (ds/opt :description) string?
   (ds/opt :discountType) discount-type-spec
   (ds/opt :discountValue) string?
   (ds/opt :expiresAt) inst?
   (ds/opt :isActive) boolean?
   (ds/opt :isCombineable) boolean?
   (ds/opt :maxDiscountAmount) string?
   (ds/opt :maxUses) int?
   (ds/opt :maxUsesPerCustomer) int?
   (ds/opt :minOrderAmount) string?
   (ds/opt :productIds) any-type-spec
   (ds/opt :startsAt) inst?
   })

(def coupon-update-spec
  (ds/spec
    {:name ::coupon-update
     :spec coupon-update-data}))
