(ns simple-billy-api.specs.packing-complete-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def packing-complete-response-data
  {
   (ds/req :message) string?
   (ds/req :new_state) string?
   (ds/req :order_number) string?
   (ds/req :success) boolean?
   })

(def packing-complete-response-spec
  (ds/spec
    {:name ::packing-complete-response
     :spec packing-complete-response-data}))
