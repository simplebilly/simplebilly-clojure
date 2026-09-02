(ns simple-billy-api.specs.gdpr-notification
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-notification-data
  {
   (ds/req :createdAt) inst?
   (ds/req :id) uuid?
   (ds/req :isRead) boolean?
   (ds/opt :message) string?
   (ds/req :tenantId) uuid?
   (ds/req :title) string?
   })

(def gdpr-notification-spec
  (ds/spec
    {:name ::gdpr-notification
     :spec gdpr-notification-data}))
