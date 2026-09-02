(ns simple-billy-api.specs.delivery-appointment-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-appointment-status-data
  {
   })

(def delivery-appointment-status-spec
  (ds/spec
    {:name ::delivery-appointment-status
     :spec delivery-appointment-status-data}))
