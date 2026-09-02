(ns simple-billy-api.specs.packing-complete-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def packing-complete-request-data
  {
   (ds/opt :notes) string?
   (ds/req :order_number) string?
   (ds/opt :shipment_id) string?
   (ds/opt :video_url) string?
   })

(def packing-complete-request-spec
  (ds/spec
    {:name ::packing-complete-request
     :spec packing-complete-request-data}))
