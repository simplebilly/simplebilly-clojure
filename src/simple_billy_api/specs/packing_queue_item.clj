(ns simple-billy-api.specs.packing-queue-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def packing-queue-item-data
  {
   (ds/req :created_at) string?
   (ds/req :customer_id) string?
   (ds/req :delivery_note_printed) boolean?
   (ds/req :items) any-type-spec
   (ds/req :items_count) int?
   (ds/req :label_printed) boolean?
   (ds/req :order_number) string?
   (ds/req :order_status) string?
   (ds/opt :shipment_id) string?
   (ds/opt :shipping_address) any-type-spec
   (ds/req :shipping_method) string?
   (ds/opt :tracking_number) string?
   (ds/opt :video_recording) string?
   })

(def packing-queue-item-spec
  (ds/spec
    {:name ::packing-queue-item
     :spec packing-queue-item-data}))
