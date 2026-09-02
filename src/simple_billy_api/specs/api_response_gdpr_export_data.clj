(ns simple-billy-api.specs.api-response-gdpr-export-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.gdpr-activity :refer :all]
            [simple-billy-api.specs.gdpr-api-key :refer :all]
            [simple-billy-api.specs.gdpr-billing-info :refer :all]
            [simple-billy-api.specs.gdpr-notification :refer :all]
            [simple-billy-api.specs.gdpr-refresh-token :refer :all]
            [simple-billy-api.specs.gdpr-tenant :refer :all]
            [simple-billy-api.specs.gdpr-usage-event :refer :all]
            [simple-billy-api.specs.gdpr-user :refer :all]
            )
  (:import (java.io File)))


(def api-response-gdpr-export-data-data
  {
   (ds/req :activityLog) (s/coll-of gdpr-activity-spec)
   (ds/req :apiKeys) (s/coll-of gdpr-api-key-spec)
   (ds/req :billing) (s/coll-of gdpr-billing-info-spec)
   (ds/req :exportedAt) inst?
   (ds/req :generatedByAi) boolean?
   (ds/req :notifications) (s/coll-of gdpr-notification-spec)
   (ds/req :refreshTokens) (s/coll-of gdpr-refresh-token-spec)
   (ds/req :tenants) (s/coll-of gdpr-tenant-spec)
   (ds/req :usageEvents) (s/coll-of gdpr-usage-event-spec)
   (ds/req :user) gdpr-user-spec
   })

(def api-response-gdpr-export-data-spec
  (ds/spec
    {:name ::api-response-gdpr-export-data
     :spec api-response-gdpr-export-data-data}))
