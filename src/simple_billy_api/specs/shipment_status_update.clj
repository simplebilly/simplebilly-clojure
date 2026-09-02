(ns simple-billy-api.specs.shipment-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def shipment-status-update-data
  {
   (ds/opt :delivered_at) string?
   (ds/opt :signed_by) string?
   (ds/req :status) string?
   (ds/opt :tracking_number) string?
   })

(def shipment-status-update-spec
  (ds/spec
    {:name ::shipment-status-update
     :spec shipment-status-update-data}))
