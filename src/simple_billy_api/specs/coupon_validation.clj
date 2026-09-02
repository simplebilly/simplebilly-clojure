(ns simple-billy-api.specs.coupon-validation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def coupon-validation-data
  {
   (ds/req :code) string?
   (ds/req :discount_type) string?
   (ds/req :discount_value) string?
   (ds/req :discounted_amount) string?
   (ds/opt :max_discount_amount) string?
   (ds/opt :reason) string?
   (ds/req :valid) boolean?
   })

(def coupon-validation-spec
  (ds/spec
    {:name ::coupon-validation
     :spec coupon-validation-data}))
