(ns simple-billy-api.specs.delivery-appointment-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.delivery-appointment-status :refer :all]
            )
  (:import (java.io File)))


(def delivery-appointment-create-data
  {
   (ds/req :email) string?
   (ds/opt :notes) string?
   (ds/opt :phone) string?
   (ds/req :requestedDate) inst?
   (ds/req :status) delivery-appointment-status-spec
   (ds/req :supplierName) string?
   (ds/opt :timeSlot) string?
   (ds/req :warehouseId) string?
   })

(def delivery-appointment-create-spec
  (ds/spec
    {:name ::delivery-appointment-create
     :spec delivery-appointment-create-data}))
