(ns simple-billy-api.specs.gdpr-usage-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-usage-event-data
  {
   (ds/req :createdAt) inst?
   (ds/req :eventType) string?
   (ds/req :id) uuid?
   (ds/req :quantity) int?
   (ds/req :tenantId) uuid?
   })

(def gdpr-usage-event-spec
  (ds/spec
    {:name ::gdpr-usage-event
     :spec gdpr-usage-event-data}))
