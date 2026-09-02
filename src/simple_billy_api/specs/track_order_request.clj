(ns simple-billy-api.specs.track-order-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def track-order-request-data
  {
   (ds/req :email) string?
   (ds/req :order_number) string?
   })

(def track-order-request-spec
  (ds/spec
    {:name ::track-order-request
     :spec track-order-request-data}))
