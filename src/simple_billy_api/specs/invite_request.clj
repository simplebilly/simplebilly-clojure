(ns simple-billy-api.specs.invite-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def invite-request-data
  {
   (ds/req :email) string?
   })

(def invite-request-spec
  (ds/spec
    {:name ::invite-request
     :spec invite-request-data}))
