(ns simple-billy-api.specs.public-delivery-appointment-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def public-delivery-appointment-request-data
  {
   (ds/req :email) string?
   (ds/opt :notes) string?
   (ds/req :requestedDate) inst?
   (ds/req :supplierName) string?
   (ds/opt :timeSlot) string?
   (ds/req :warehouseCode) string?
   })

(def public-delivery-appointment-request-spec
  (ds/spec
    {:name ::public-delivery-appointment-request
     :spec public-delivery-appointment-request-data}))
