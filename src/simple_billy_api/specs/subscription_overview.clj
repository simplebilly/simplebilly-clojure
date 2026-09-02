(ns simple-billy-api.specs.subscription-overview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.plan-features :refer :all]
            [simple-billy-api.specs.plan-limits :refer :all]
            [simple-billy-api.specs.usage-snapshot :refer :all]
            )
  (:import (java.io File)))


(def subscription-overview-data
  {
   (ds/opt :currentPeriodEnd) inst?
   (ds/req :features) plan-features-spec
   (ds/req :isTrialing) boolean?
   (ds/req :limits) plan-limits-spec
   (ds/opt :manageUrl) string?
   (ds/req :plan) string?
   (ds/req :planName) string?
   (ds/req :priceEur) float?
   (ds/opt :quantity) int?
   (ds/opt :status) string?
   (ds/opt :subscriptionId) string?
   (ds/opt :trialEndsAt) inst?
   (ds/req :usage) usage-snapshot-spec
   })

(def subscription-overview-spec
  (ds/spec
    {:name ::subscription-overview
     :spec subscription-overview-data}))
