(ns simple-billy-api.specs.model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def model-data
  {
   (ds/req :backup_codes) (s/coll-of string?)
   (ds/req :created_at) inst?
   (ds/opt :deleted_at) inst?
   (ds/req :email) string?
   (ds/req :email_verified) boolean?
   (ds/req :id) uuid?
   (ds/req :is_active) boolean?
   (ds/req :is_totp_enabled) boolean?
   (ds/opt :last_login) inst?
   (ds/req :name) string?
   (ds/opt :oauth_id) string?
   (ds/opt :oauth_provider) string?
   (ds/opt :password_changed_at) inst?
   (ds/req :password_hash) string?
   (ds/opt :picture) string?
   (ds/opt :privacy_accepted_at) inst?
   (ds/opt :totp_secret) string?
   (ds/req :updated_at) inst?
   })

(def model-spec
  (ds/spec
    {:name ::model
     :spec model-data}))
