(ns simple-billy-api.specs.return-order-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-order-status-update-data
  {
   (ds/req :status) string?
   })

(def return-order-status-update-spec
  (ds/spec
    {:name ::return-order-status-update
     :spec return-order-status-update-data}))
