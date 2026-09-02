(ns simple-billy-api.specs.public-delivery-appointment-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-delivery-appointment-status-response-data
  {
   (ds/req :appointmentId) string?
   (ds/req :requestedDate) inst?
   (ds/req :status) string?
   (ds/opt :timeSlot) string?
   (ds/req :warehouseName) string?
   })

(def public-delivery-appointment-status-response-spec
  (ds/spec
    {:name ::public-delivery-appointment-status-response
     :spec public-delivery-appointment-status-response-data}))
