(ns simple-billy-api.specs.notification-dto
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def notification-dto-data
  {
   (ds/req :created_at) inst?
   (ds/req :id) uuid?
   (ds/req :is_read) boolean?
   (ds/opt :message) string?
   (ds/req :sent_via_email) boolean?
   (ds/req :tenant_id) uuid?
   (ds/req :title) string?
   (ds/req :user_id) uuid?
   })

(def notification-dto-spec
  (ds/spec
    {:name ::notification-dto
     :spec notification-dto-data}))
