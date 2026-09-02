(ns simple-billy-api.specs.public-delivery-appointment-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-delivery-appointment-response-data
  {
   (ds/req :appointmentId) string?
   (ds/req :confirmationHint) string?
   (ds/req :message) string?
   (ds/req :status) string?
   })

(def public-delivery-appointment-response-spec
  (ds/spec
    {:name ::public-delivery-appointment-response
     :spec public-delivery-appointment-response-data}))
