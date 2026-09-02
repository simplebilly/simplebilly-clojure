(ns simple-billy-api.specs.support-ticket-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def support-ticket-status-data
  {
   })

(def support-ticket-status-spec
  (ds/spec
    {:name ::support-ticket-status
     :spec support-ticket-status-data}))
