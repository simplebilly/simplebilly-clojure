(ns simple-billy-api.specs.user-profile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def user-profile-data
  {
   (ds/req :created_at) inst?
   (ds/req :email) string?
   (ds/req :email_verified) boolean?
   (ds/req :first_name) string?
   (ds/req :full_name) string?
   (ds/req :id) uuid?
   (ds/req :last_name) string?
   })

(def user-profile-spec
  (ds/spec
    {:name ::user-profile
     :spec user-profile-data}))
