(ns simple-billy-api.specs.appointment-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def appointment-status-update-data
  {
   (ds/req :status) string?
   })

(def appointment-status-update-spec
  (ds/spec
    {:name ::appointment-status-update
     :spec appointment-status-update-data}))
