(ns simple-billy-api.specs.gdpr-activity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-activity-data
  {
   (ds/req :action) string?
   (ds/req :createdAt) inst?
   (ds/opt :description) string?
   (ds/req :id) uuid?
   (ds/req :tenantId) uuid?
   })

(def gdpr-activity-spec
  (ds/spec
    {:name ::gdpr-activity
     :spec gdpr-activity-data}))
