(ns simple-billy-api.specs.gdpr-api-key
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def gdpr-api-key-data
  {
   (ds/req :createdAt) inst?
   (ds/opt :expiresAt) inst?
   (ds/req :id) uuid?
   (ds/req :keyId) uuid?
   (ds/req :name) string?
   (ds/req :revoked) boolean?
   })

(def gdpr-api-key-spec
  (ds/spec
    {:name ::gdpr-api-key
     :spec gdpr-api-key-data}))
