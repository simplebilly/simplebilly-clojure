(ns simple-billy-api.specs.delivery-date-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-date-status-update-data
  {
   (ds/req :status) string?
   })

(def delivery-date-status-update-spec
  (ds/spec
    {:name ::delivery-date-status-update
     :spec delivery-date-status-update-data}))
