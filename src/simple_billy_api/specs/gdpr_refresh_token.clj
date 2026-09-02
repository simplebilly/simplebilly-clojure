(ns simple-billy-api.specs.gdpr-refresh-token
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-refresh-token-data
  {
   (ds/req :createdAt) inst?
   (ds/req :expiresAt) inst?
   (ds/req :id) uuid?
   (ds/opt :revokedAt) inst?
   (ds/req :tenantId) uuid?
   })

(def gdpr-refresh-token-spec
  (ds/spec
    {:name ::gdpr-refresh-token
     :spec gdpr-refresh-token-data}))
