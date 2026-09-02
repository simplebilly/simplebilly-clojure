(ns simple-billy-api.specs.tracked-shipment
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.tracking-event :refer :all]
            )
  (:import (java.io File)))


(def tracked-shipment-data
  {
   (ds/req :carrier) string?
   (ds/req :events) (s/coll-of tracking-event-spec)
   (ds/opt :label_url) string?
   (ds/req :status) string?
   (ds/opt :tracking_number) string?
   (ds/opt :tracking_url) string?
   })

(def tracked-shipment-spec
  (ds/spec
    {:name ::tracked-shipment
     :spec tracked-shipment-data}))
