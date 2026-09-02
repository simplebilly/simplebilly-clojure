(ns simple-billy-api.specs.order-state-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-state-update-data
  {
   (ds/opt :send_state_to_shop) boolean?
   (ds/req :state) string?
   })

(def order-state-update-spec
  (ds/spec
    {:name ::order-state-update
     :spec order-state-update-data}))
