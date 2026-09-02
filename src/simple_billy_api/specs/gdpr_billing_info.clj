(ns simple-billy-api.specs.gdpr-billing-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-billing-info-data
  {
   (ds/opt :currentPeriodEnd) inst?
   (ds/opt :currentPeriodStart) inst?
   (ds/opt :plan) string?
   (ds/opt :status) string?
   (ds/req :tenantId) uuid?
   })

(def gdpr-billing-info-spec
  (ds/spec
    {:name ::gdpr-billing-info
     :spec gdpr-billing-info-data}))
