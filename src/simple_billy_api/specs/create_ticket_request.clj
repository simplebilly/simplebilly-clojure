(ns simple-billy-api.specs.create-ticket-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def create-ticket-request-data
  {
   (ds/opt :channel_id) uuid?
   (ds/opt :channel_type) string?
   (ds/opt :customer_email) string?
   (ds/opt :customer_id) string?
   (ds/opt :customer_name) string?
   (ds/opt :external_id) string?
   (ds/req :message_body) string?
   (ds/opt :order_ref) string?
   (ds/req :subject) string?
   })

(def create-ticket-request-spec
  (ds/spec
    {:name ::create-ticket-request
     :spec create-ticket-request-data}))
