(ns simple-billy-api.specs.tenant-user
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tenant-user-data
  {
   (ds/req :email) string?
   (ds/req :email_verified) boolean?
   (ds/req :is_active) boolean?
   (ds/req :joined_at) inst?
   (ds/opt :last_login) inst?
   (ds/req :name) string?
   (ds/req :permissions) (s/coll-of string?)
   (ds/req :role) string?
   (ds/req :user_id) uuid?
   })

(def tenant-user-spec
  (ds/spec
    {:name ::tenant-user
     :spec tenant-user-data}))
