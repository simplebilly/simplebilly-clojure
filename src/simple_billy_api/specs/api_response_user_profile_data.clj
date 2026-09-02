(ns simple-billy-api.specs.api-response-user-profile-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-response-user-profile-data-data
  {
   (ds/req :created_at) inst?
   (ds/req :email) string?
   (ds/req :email_verified) boolean?
   (ds/req :first_name) string?
   (ds/req :full_name) string?
   (ds/req :id) uuid?
   (ds/req :last_name) string?
   })

(def api-response-user-profile-data-spec
  (ds/spec
    {:name ::api-response-user-profile-data
     :spec api-response-user-profile-data-data}))
