(ns simple-billy-api.specs.quota-overview
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.plan-features :refer :all]
            [simple-billy-api.specs.plan-limits :refer :all]
            [simple-billy-api.specs.metered-usage :refer :all]
            [simple-billy-api.specs.usage-snapshot :refer :all]
            )
  (:import (java.io File)))


(def quota-overview-data
  {
   (ds/req :features) plan-features-spec
   (ds/req :isTrialing) boolean?
   (ds/req :limits) plan-limits-spec
   (ds/req :metered) (s/coll-of metered-usage-spec)
   (ds/req :plan) string?
   (ds/req :planName) string?
   (ds/opt :trialEndsAt) inst?
   (ds/req :usage) usage-snapshot-spec
   })

(def quota-overview-spec
  (ds/spec
    {:name ::quota-overview
     :spec quota-overview-data}))
