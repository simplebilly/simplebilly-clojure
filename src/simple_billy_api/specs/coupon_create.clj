(ns simple-billy-api.specs.coupon-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.discount-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def coupon-create-data
  {
   (ds/req :code) string?
   (ds/opt :description) string?
   (ds/req :discountType) discount-type-spec
   (ds/req :discountValue) string?
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

(def coupon-create-spec
  (ds/spec
    {:name ::coupon-create
     :spec coupon-create-data}))
