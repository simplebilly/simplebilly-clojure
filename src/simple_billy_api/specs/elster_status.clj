(ns simple-billy-api.specs.elster-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def elster-status-data
  {
   (ds/req :cert_configured) boolean?
   (ds/req :eric_available) boolean?
   (ds/opt :eric_version) string?
   (ds/req :feature_enabled) boolean?
   (ds/req :hint) string?
   (ds/req :mode) string?
   (ds/req :vendor_id_configured) boolean?
   })

(def elster-status-spec
  (ds/spec
    {:name ::elster-status
     :spec elster-status-data}))
